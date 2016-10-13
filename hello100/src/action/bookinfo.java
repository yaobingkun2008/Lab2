package action;

public class bookinfo 
{
	private String ISBN;
	private String title;
	private String authorid;
	private String publisher;
	private String publishdate;
	private String price;
	private String authorname;
	private String age;
	private String country;
	
	public bookinfo(String ISBN,String title,String authorid,String publisher,String publishdate,String price,String authorname,String age,String country)
	{
		this.ISBN = ISBN;
		this.title = title;
		this.authorid = authorid;
		this.publisher = publisher;
		this.publishdate = publishdate;
		this.price = price;
		this.authorname = authorname;
		this.age = age;
		this.country = country;
	}
	/*
	public void bookoutput()
	{
		System.out.println(ISBN);
		System.out.println(title);
		System.out.println(authorid);
		System.out.println(publisher);
		System.out.println(publishdate);
		System.out.println(price);
	}
	*/
	public String getISBN()
	{
		return ISBN;
	}
	public String gettitle()
	{
		return title;
	}
	public String getauthorid()
	{
		return authorid;
	}
	public String getpublisher()
	{
		return publisher;
	}
	public String getpublishdate()
	{
		return publishdate;
	}
	public String getprice()
	{
		return price;
	}
	public String getauthorname()
	{
		return authorname;
	}
	public String getage()
	{
		return age;
	}
	public String getcountry()
	{
		return country;
	}
}
