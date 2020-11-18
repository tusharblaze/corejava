package com.heraizen.cj.day6;

public interface MyIterator {
   public boolean hasNext();
   public String next();
}

class UserList implements MyIterator{
    
	private String[] name;
	static int count;
	
	UserList(String[] name){
		this.name = name;
		count = -1;
	}
	

	@Override
	public boolean hasNext() {
		try {
			if(name[count+1] == null) {
				return false;
			}else {
				return true;
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
		
		
	}

	@Override
	public String next() {
		count += 1;
		return name[count];
	}
	
	public static MyIterator getIterator() {
		
		return new UserList(new String[]{"Tushar","Anand","has","a","Good","Intellect","and", "Humourus","Sense"});
	}
	
}