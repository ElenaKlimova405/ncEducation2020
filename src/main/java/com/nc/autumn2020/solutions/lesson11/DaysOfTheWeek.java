package com.nc.autumn2020.solutions.lesson11;

public enum DaysOfTheWeek {
    MONDAY("План на понедельник — ждать пятницу."),
    TUESDAY("Сегодня вторник! А я забыл… А понедельник, скажите, был?"),
    WEDNESDAY("Среда обитания динозавров была такова, что они там очень хорошо обитали."),
    THURSDAY("Сегодня четверг. \n" +
            "Это хуже, чем суббота, но лучше, чем вторник. \n" +
            "Более того, это гораздо лучше, чем понедельник. Но немного хуже, чем пятница. \n" +
            "Кроме того, четверг всё же лучше, чем среда. Немного. \n" +
            "Но я вам больше скажу: четверг даже лучше, чем воскресенье. \n" +
            "Потому что в воскресенье завтра понедельник, а в четверг завтра пятница."),
    FRIDAY("Как же пятницу все ждали,\n" +
            "Прям ночей не досыпали.\n" +
            "Вот пришла она, родная,\n" +
            "Заводная вся такая.\n" +
            "Ну, какая, блин, работа,\n" +
            "Если завтра ждет суббота."),
    SATURDAY("Есть люди-Субботы: для них жизнь праздник, настоящее и будущее одинаково хороши,\n" +
            "про прошлое не хотят даже вспоминать."),
    SUNDAY("Воскресенье - день с повышенным содержанием понедельника в крови.");

    String citation;
    DaysOfTheWeek(String citation) {
        this.citation = citation;
    }
}