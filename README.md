# Sample Spring Datadog
Sample Spring Boot application with Datadog enabled

## About
This was created in order to learn how to use Datadog with Spring 
Boot services.

## Usage
You ill first need to change the `DD_API_KEY` value in the `docker-compose.yml`
file in order to be able to send data to your Datadog account. After that, you
should be good to go.

```bash
gradle bootJar
docker-compose up
```

And you are done. Just go to Datadog's [APM][1] and see the profiling in
action!

[1]: https://app.datadoghq.com/apm/services