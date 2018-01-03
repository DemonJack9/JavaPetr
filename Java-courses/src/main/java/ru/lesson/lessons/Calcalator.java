package ru.lesson.lessons;
class Calculator{
	private int result;
	public void add(int ... params){
		for(Integer param : params){
			this.result+=param;
		}
	}

	public void div(int ... args){
		if(args.length > 0){

		} else {

		}
	}

	public int getResult(){
		return this.result;
	}

	public void clearResult(){
		this.result = 0;
	}
}
		