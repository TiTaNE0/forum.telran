package telran.java38.forum.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode(of = {"id"})
public class Post {
	String id;
	@Setter
	String title;
	@Setter
	String content;
	String author;
	LocalDateTime dateCreated;
	@Setter
	List<String> tags;
	Integer likes;
	List<Object> comments;
	
	public Post(String title, String content, String author, List<String> tags) {
		this.title = title;
		this.content = content;
		this.author = author;
		dateCreated = LocalDateTime.now();
		this.tags = tags;
		likes = 0;
		comments = new ArrayList<Object>();
	}

	public boolean addComment(Object comment) {
		return comments.add(comment);
	}
	
	public Integer addLike() {
		return likes++;
	}
}
