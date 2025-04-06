function generateCSV(elements, url) {
  const headers = ['Outer HTML'];
  const rows = elements.map(element => [

    element.outerHTML || 'N/A',

  ]);
//const headers = ['Element Type', 'ID', 'Name', 'Class Name', 'CSS Selector', 'XPath', 'Outer HTML', 'Timestamp'];
//  const rows = elements.map(element => [
//    element.type || 'N/A',
//    element.id || 'N/A',
//    element.name || 'N/A',
//    element.className || 'N/A',
//    element.cssSelector || 'N/A',
//    element.xpath || 'N/A',
//    element.outerHTML || 'N/A',
//    element.timestamp || 'N/A'
//  ]);
  const csvContent = [
    headers.join(','),
    ...rows.map(row => row.map(value => `"${value.replace(/"/g, '""')}"`).join(','))
  ].join('\n');

  const blob = new Blob([csvContent], { type: 'text/csv' });
  const urlSafe = url.replace(/[:\/?<>\\*|"]/g, '_'); // Sanitize the URL
  const filename = `web_elements_${urlSafe}_${new Date().toISOString().slice(0, 10)}.csv`;
  const fileUrl = URL.createObjectURL(blob);
  const link = document.createElement('a');
  link.setAttribute('href', fileUrl);
  link.setAttribute('download', filename);
  document.body.appendChild(link);
  link.click();
  document.body.removeChild(link);
}

function getXPath(element) {
  const paths = [];
  while (element && element.nodeType === Node.ELEMENT_NODE) {
    let selector = element.nodeName.toLowerCase();
    if (element.id) {
      selector += `#${element.id}`;
    } else if (element.className) {
      const classes = element.className.split(/\s+/).join('.');
      selector += `.${classes}`;
    }

    const siblings = Array.from(element.parentNode.children).filter(
      sibling => sibling.nodeName === element.nodeName
    );
    if (siblings.length > 1) {
      const index = siblings.indexOf(element) + 1;
      selector += `:nth-of-type(${index})`;
    }

    paths.unshift(selector);
    element = element.parentNode;
  }
  return paths.length ? paths.join(' > ') : null;
}

const elements = [];
const currentUrl = window.location.href; // Capture the current URL
//['body', 'header','footer','button', 'input', 'a', 'select', 'img', 'textarea', 'checkbox', 'radio'].forEach(tag => {
['button', 'input', 'a', 'select', 'img', 'textarea', 'checkbox', 'radio'].forEach(tag => {
  document.querySelectorAll(tag).forEach(el => {
    elements.push({
      type: el.tagName.toLowerCase(),
      id: el.id || 'No ID',
      name: el.name || 'No Name',
      className: el.className || '',
      cssSelector: el.tagName.toLowerCase() + (el.id ? `#${el.id}` : ''),
      xpath: getXPath(el),
      outerHTML: el.outerHTML || '',
      timestamp: new Date().toISOString()
    });
  });
});

generateCSV(elements, currentUrl);
