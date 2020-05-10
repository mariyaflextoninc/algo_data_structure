import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MostUserLoggedIn {
	//static PriorityQueue<User>  pq;
	static HashMap<String, User> hMap ;
	
	public MostUserLoggedIn(){
		//pq = null;
	}

	public static void main(String[] args) {
		String str = "user1,user2,user3,user1,user2,user3,user4,user4,user2";
		frequentUser(str,3);
	}
	
	public static String[] frequentUser(String str2, int k){
		String arr[] = str2.split(",");
		hMap = new HashMap();
		PriorityQueue<User>  pq = new PriorityQueue<User>(k,new Comparator<User>(){
			public int compare(User u1, User u2){
				return u1.count - u2.count;
			}
		});
		for(int i =0; i <arr.length;i++){
			User user = hMap.get(arr[i]);
			if(user == null ){
				user = new User(arr[i],1);
				hMap.put(arr[i], user);
				if(pq.size()<k){
					pq.add(user);
				}
			}else {
				int count = user.getCount()+1;
				User newUser = new User(arr[i],count);
				if(pq.size() < k){
					boolean bol = pq.remove(user);
					hMap.put(arr[i], newUser);
					pq.add(newUser);
				}
				else if(newUser.count> pq.peek().count){
					pq.poll();
					pq.offer(newUser);
				}
			}
		}
		String result[] = new String[k];
		if(!pq.isEmpty()){
			int j = 0;
			Iterator<User> itr = pq.iterator();
			while(itr.hasNext()){
				result[j++] = itr.next().getUsername();
				System.out.println("result= "+result[j-1]);
			}
		}
		return result;
	}

}
class User{
	String username;
	int count;
	
	public void setCount(int count) {
		this.count = count;
	}
	public User(String username,int count){
		this.username = username;
		this.count = count;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCount() {
		return count;
	}
	
}
