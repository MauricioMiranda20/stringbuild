package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private int like;
	
	private List<Comment> comment = new ArrayList<>();
	
	SimpleDateFormat smf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(Date moment, String title, String content, int like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<Comment> getComment() {
		return comment;
	}
	
	public void addComment(Comment comments) {
		comment.add(comments);
	}
	public void removerComment(Comment comments) {
		comment.remove(comments);
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		
		strb.append(title+"\n");
		strb.append(like+" Likes - "+smf.format(moment)+"\n");
		strb.append(content+"\n");
		strb.append("Comments :\n");
		
		for(Comment c : comment) {
			strb.append(c.getText()+"\n");
		}
		
		return strb.toString();
	}
	
	
	
	
}
