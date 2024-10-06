create a DockerFile
move to minikube 
  - eval $(minikube -p minikube docker-env)

build a docker image
  - docker build --build-arg JAR_FILE=build/libs/\*.jar -t spring-hello-docker .

created the deployment
   - kubectl apply -f k8s-deployment.yaml

check the deployment
   - kubectl get deployment
check pods details
   - kubectl get pods
check pods logs
   - kubectl logs <pods id>

create service
   - kubectl apply -f k8s-service.yaml
To check get the service are created or not
   - kubectl get service
   - kubectl get svc 

To check the running IP
   - kubectl get nodes -o wide
   - minikube ip

To validate the API
http://192.168.49.2:32268/hello/persons



    

