# spring-boot-aws-serverless
## Getting Started

- Package Application
```mvn package```
- Set Profile:
```export AWS_PROFILE=default```
- Login into aws:
```saml2aws login -p default```
- Upload to AWS s3 bucket:
``` 
aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket <BUCKET_NAME> 
```
- Deploy Application:
``` 
aws cloudformation deploy --template-file output-sam.yaml --stack-name SpringBootAwsServerless --capabilities CAPABILITY_IAM
```
- Check deployment:
```https://console.aws.amazon.com/cloudformation```
