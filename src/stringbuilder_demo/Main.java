package stringbuilder_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entites.Comment;
import entites.Post;

public class Main {

	public static void main(String[] args) throws ParseException {		
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		String dateS = "21/06/2018 13:05:44";
		Date date = fmt.parse(dateS);
		
		String title = "Traveling to New Zealand";
		
		String content = "I'm going visit to this wonderful country !";
		
		int like = 12;
		
		Post post = new Post(date,title,content,like);
		
		String text1 = "Have a nice trip";
		String text2 = "Wow that's awesome !";
		
		post.addComment(new Comment(text1));
		post.addComment(new Comment(text2));
		
		System.out.println(post.toString());
		
	}

}
