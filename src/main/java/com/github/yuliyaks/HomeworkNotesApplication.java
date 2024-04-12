/*
Фреймворк Spring
Урок 6. Проектирование и реализация API для серверного приложения.
Базовое задание:
Условие:
Важно! В проекте используем обязательно Spring Data и Lombok!
Разработайте небольшое веб-приложение на Spring Boot, которое будет представлять собой сервис для учета личных заметок.
Приложение должно поддерживать следующие функции:
Все методы контроллера возвращают ResponseEntity(как на семинаре)
1. Добавление заметки. (Подсказка @PostMapping)
2. Просмотр всех заметок.(Подсказка @GetMapping)
3. Получение заметки по id. (Подсказка @GetMapping("/{id}") )
4. Редактирование заметки.(Подсказка @PutMapping("/{id}") )
5. Удаление заметки.(Подсказка @DeleteMapping("/{id}") )
Структура заметки:
- ID (автоинкрементное)(тип - Long)
- Заголовок (не может быть пустым)(тип - String)
- Содержимое (не может быть пустым)(тип - String)
- Дата создания (автоматически устанавливается при создании заметки)(тип - LocalDateTime)

Подсказка:
Репозиторий наследует JpaRepository<Note, Long>. В репозитории добавляем метод Optional<Note> findById(Long id);
Подсказка:
В проект добавляем зависимости: spring data jpa, h2, lombok, spring web
 */

package com.github.yuliyaks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkNotesApplication.class, args);
    }

}
