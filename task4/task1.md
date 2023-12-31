**Вопрос 1**

Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

- **Изоляция тестов**: Заглушки позволяют изолировать модуль, который тестируется, от его зависимостей. Это позволяет проверить его поведение независимо от внешних факторов.

- **Повторяемость**: С использованием заглушек можно создать предсказуемое окружение для тестирования. Можно контролировать, какие значения возвращают заглушки, что делает тесты повторяемыми.

- **Ускорение тестов**: Заглушки позволяют избежать реального взаимодействия с внешними ресурсами, такими как базы данных или внешние API, что делает тесты быстрее.

- **Тестирование разных сценариев**: Можно использовать заглушки для имитации разных сценариев, включая ошибочные ситуации, которые могут быть сложно воссоздать в реальном окружении.

**Вопрос 2**

Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

Для проверки, что метод был вызван с определенными аргументами, следует использовать **заглушки с утверждениями** (assertion-based stubs) или **заглушки с шпионами** (spies). Эти типы заглушек позволяют отслеживать вызовы методов и проверять переданные аргументы.

**Вопрос 3**

Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

Для возвращения определенного значения или исключения в ответ на вызов метода, следует использовать **заглушки с фиксированными ответами** (value-based stubs). Эти заглушки предоставляют контролируемое значение или исключение при вызове метода.

**Вопрос 4**

Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

Для имитации взаимодействия с внешним API или базой данных в модульных тестах, рекомендуется использовать **заглушки на уровне интеграции** (integration-level stubs) или **фейковые объекты** (fakes). Эти заглушки имитируют поведение внешних систем, позволяя тестировать модуль без фактического взаимодействия с реальными внешними ресурсами.
