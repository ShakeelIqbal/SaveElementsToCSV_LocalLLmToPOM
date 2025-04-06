# Define the path to your CSV file
$csvFilePath = "C:\Users\shake\Downloads\elements.csv"
$outputFilePath = "C:\Users\shake\Downloads\elements.java"

# Read the CSV file
$csvContent = Import-Csv -Path $csvFilePath

# Convert the CSV content to a string
$csvString = $csvContent | Out-String

# Output the string
Write-Output $csvString

#-------------------------------------------
$headers = @{
    "Content-Type" = "application/octet-stream"
}

$body = @{
    model = "qwen2.5-coder"
    prompt = "Create PageObject model page class for the below web elements using java, and return a java file only, no other text in responce."+$csvString
    stream = $false
} | ConvertTo-Json -Depth 10

Invoke-RestMethod -Uri "http://localhost:11434/api/generate" -Method Post -Headers $headers -Body $body | Set-Content -Path $outputFilePath

#$response = Invoke-RestMethod -Uri "http://localhost:11434/api/generate" -Method Post -Headers $headers -Body $body

# Extract the content between ```java and ```
#if ($response -match '```java\s*(.*?)\s*```') {
#if ($response -match "'''java\s*(.*?)\s*''';") {
#    $javaContent = $Matches[1]

    # Write the extracted content to the output file
#    $javaContent | Set-Content -Path $outputFilePath

#    Write-Output "The extracted content has been written to $outputFilePath"
#} else {
#    Write-Output "No content found between ```java and ``` in the response."
#    }