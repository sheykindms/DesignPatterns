Назначение:
1) Динамическое добавление новых обязанностей объектам
2) Если расширение путём пораждения подклассов невозможно
3) Реализация обязанностей, которые могут быть сняты с объекта+

1.) Наследование - одна из форм расширения, но оно не всегда обеспечивает гибкость архитектуры.
2.) Следует предусмотреть возможность расширения поведения без изменения существующего кода.
3.) Композиция и делегирование часто используются для динамического добавления нового поведения.
4.) Паттерн Декоратор представляет альтернативу субклассированию в области расширения поведения.
5.) Типы декораторов соответствуют типам декорируемых компонентов (соответствие достигает посредством наследования или
реализации интерфейса).
6.) Декораторы изменяют поведение компонетов, добавляя новую функциональность до и (или) после (или даже вместо) вызовов
методов компонентов.
7.) Компонент может декорироваться любыым количетсвом декораторов.
8.) Декораторы обычно прозрачны для клиентов компонента (если клиентский код не зависит от конкретного типа компонента).