package ru.lesson.lessons;

public class Calculator {
    private int result;
    public void add(int ... params){
        for(int param: params){
            this.result += param;
        }
    }

    /**
     *
     * @param args
     * @throws UserException Если агрументов нет, выкидывает оисключение
     */
    public void div(int ... args) throws UserException{
        if(args.length > 0){
            this.result = args[0];
            for(int params: args){
                if(params == 0){
                    throw new IllegalArgumentException("You try to div by 0, Please change args!");
                }
                this.result /= params;
            }
        } else {
            throw new UserException("You should enter args!");
        }
    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}
