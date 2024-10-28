# Приложение для добавления в БД записей получаемых из JSON файла.

## Описание работы:
* Добавление выполняется в коллекцию - search_query;
* ВНИМАНИЕ: Коллекция полностью очищается перед добавлением новых записей.

## Предварительные условия:
* Должен быть развёрнут сервер mongoDB;
* Должна существовать БД.

## Требование к входному файлу:
***
**Файл должен содержать JSON записи разделённые переводом строки;
Если в записи присутствует поле _id, оно будет пропущено и не попадёт в БД, будет создано своё.**
***
```
{ "_id" : ObjectId("647df0648314d903fa1b9209"), (ОСТАЛЬНОЕ СОДЕРЖИМОЕ JSON НОДЫ)}
{ "_id" : ObjectId("64804bf88314d903fa1b920a"), (ОСТАЛЬНОЕ СОДЕРЖИМОЕ JSON НОДЫ)}
{ "_id" : ObjectId("64804df08314d903fa1b920b"), (ОСТАЛЬНОЕ СОДЕРЖИМОЕ JSON НОДЫ)}
```