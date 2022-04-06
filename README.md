# Fitter - простой клон twitter
> ### Тренеровочный пет-проект


- Ядро приложения `Spring Boot`
- База данных `MySQL + JPA(Hibernate)`
- Авторизация и контроль прав `Spring Security`
- Миграции БД `Flyway`
- Шаблонизатор `FreeMarker`
- Почтовый сервис `Spring Mail` через `yandex api`
- reCAPTCHA v2 `google api`


# Как запустить 
install maven and mysql

enter bash code:

`git clone  https://github.com/Praepost/fitter-app.git`

`create user bestuser identified by bestuser`

запустите ваш sql сервер, flyway мигрирует остальные данные

`mvn deploy`
>если вам необходимо обновить конфигурацию, позаботьтесь:
>>recaptcha.secret - google captacha key
> 
>>spring.mail.username - yandex developer username
> 
>>spring.mail.password - yandex developer secret app pass
>>

теперь можно поссмотреть на результат по ссылке:
`http://localhost:8081/`


# Как запустить в Docker
`TODO`

~~Необходимо мигрироват flyway из runtime в отдельный контейнер (ง ͠° ͟ʖ ͡°)ง~~

# Запуск тестов интеграционные + модульные

`TODO`

`скоро скоро`


