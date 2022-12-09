## Лабораторная работа 2

В лабораторной работе №1 вы познакомились с 

1. командой `echo`;

2. системой контроля версий *git*;

3. веб-сервисом для хостинга проектов (основанных на git) *github*;

4. последовательностью символов *shebang* `#!`.

В данной лабораторной работе расширим наши познания в командном интерпретаторе `bash`, который является не просто прослойкой между пользователем и операционной системой, но и мощным языком программирования (ЯП).

Итак, перед тем как выполнять задание:

1. Склонируйте этот репозиторий.

2. Создайте в этом репозитории файл `script.bash` и укажите путь к bash-интерпретатору, используя последовательность символов *shebang*.

3. Объявите переменную `a` и присвойте ей значение первого аргумента скрипта

```bash
a=$1
```

*Важно*! Символ присваивания `=` не должен содержать пробелов.

4. Проверьте, равна ли переменная `a` числу `23`

```bash
if [[ $a -eq 23 ]] 
then
    echo "Modify me!"
else
    echo '$a is not "23"'
fi
```

5. Если значение переменной равно `23`, прибавьте к ней число `19`и выведите результат в стандартный вывод

```bash
echo $(($a + 2))
```

6. Запустите скрипт с одним аргументом. Удостоверьтесь, что все работает так, как вы запрограммировали.

Теперь, модифицируйте полученный скрипт так, чтобы решить следующую задачу.

*Hint!* Пользуйтесь ссылками из *Дополнительных источников*.

### Задача

Заданы два целых числа <img src="https://render.githubusercontent.com/render/math?math=-100\le x, y\le100">. Найдите их сумму `x + y`, разность `x - y`, произведение `x * y` и частное `x / y`.

#### Входные данные

Два аргумента скрипта в виде

```bash
bash script.bash 5 3
```

#### Выходные данные

В стандартный вывод вывести четыре числа (сумму, разность, произведение и частное), разделенные пробелом. Частное вывести с точностью до двух знаков. Целая и дробная части должны быть разделены точкой. Если найти частное невозможно, вместо результата частного выведите символ `#`

Примеры вывода

```bash
8 2 15 1.66
```

или

```bash
5 5 0 # 
```

*Hint!* Деление возможно выполнить как средствами языка bash (выделение единиц, десятков, сотен...), так и с использованием внешних утилит ОС Linux.

### Дополнительные источники

* [Присваивание значений переменным](https://se.ifmo.ru/~ad/Documentation/ABS_Guide_ru.html#VARASSIGNMENT)

* [Подстановка переменных](https://se.ifmo.ru/~ad/Documentation/ABS_Guide_ru.html#VARSUBN)

* [Арифметические операции](https://se.ifmo.ru/~ad/Documentation/ABS_Guide_ru.html#ARITHEXP)

* [Операции сравнения ](https://se.ifmo.ru/~ad/Documentation/ABS_Guide_ru.html#COMPARISON-OPS)

* [Проверка условий](https://se.ifmo.ru/~ad/Documentation/ABS_Guide_ru.html#TESTS)

* О системе контроля версий `git`, рекомендуем прочесть разделы 1, 2.1 и 2.2 из [https://git-scm.com/book/ru/v2](https://git-scm.com/book/ru/v2).

* Ресурс, где можно найти ответы на (почти) любые вопросы - [stackoverflow.com](stackoverflow.com)

* Хорошая книга по Shell/bash в Linux - "Learn Linux Shell Scripting – Fundamentals of Bash 4.4"  Sebastiaan Tammer