# Signing XML SOAP requests
Project illustrates using of Java XML API for signing XML requests 
before sending.

## SSL Configuration
For configuring SSL first you have to generate self-signed certificate using keystore command and then in application.yml
to bind with custom store properties. 

After generating self-signed certificate fill properties under the
section **custom-store**. PK12 file should be stored on root of your project.

Replace **telekom.p12** file with your new file and change xml-sign.dockerfile to use new file name.

## Run app in docker container
1. Navigate to project directory
2. Type command: `mvn clean package -DskipTests`
3. Type command: `docker-compose build`
4. Run app with command: `docker-compose up -d`
5. Check logs of running container: `docker logs -f xml_sign`

## Author
Heril Muratović  
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic

