package com.nc.autumn2020.projects.project1;

import com.nc.autumn2020.lessons.lesson9.FileVisiterImpl;

public class LogManager {
    // ? параметры настройки, что регистрировать и выводить
    private boolean writeTime = true;
    private boolean writeLevel = true;
    private boolean writeMessage = true;
    private boolean registerInfo = true;
    private boolean registerWarning = true;
    private boolean registerSevere = true;
    // ...? что-то еще добавить?

    // сами логгеры и хендлеры
    private FileLogger fileLogger = new FileLogger();
    private DataBaseLogger dataBaseLogger = new DataBaseLogger();
    private ServerLogger serverLogger = new ServerLogger();

    private FileLogHandler fileLogHandler = new FileLogHandler();
    private DataBaseLogHandler dataBaseLogHandler = new DataBaseLogHandler();
    private ServerLogHandler serverLogHandler = new ServerLogHandler();

    public LogManager(String settingFilePath) {
        //todo чтение файла с настройками и
        // установка параметров в соответствующие поля

        //todo возможно здесь можно обеспечить
        // создание единственного экземпляра данного объекта..

    }


    //todo дальше какие-то методы для работы
    // логгеров, пока не знаю какие..
    // Вопрос: каким образом данный менеджер
    // должен управлять системой логгеров?

}
