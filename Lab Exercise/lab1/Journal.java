class Journal {
    private String authorName; 
	private	String paperTitle ;
	private	String submissionDate;
    
    public Journal(String authorName, String paperTitle, String submissionDate ){
        this.authorName= authorName;
        this.paperTitle = paperTitle;
        this.submissionDate = submissionDate;
}
    
	public void displayDetails(){
    	 System.out.println("Author's name : " + authorName);
      	 System.out.println("Title of the paper : " + paperTitle);
       	 System.out.println("Date of submission : " + submissionDate);
     
    }
    public String getSubmissionDetails(){
        StringBuilder capitalizedTitle = new StringBuilder();
        return capitalizedTitle.toString();
    }
    
    public static void main(String[] args) {
        
        Journal journal = new Journal("Sosia Ayele", " Study OOP", "2024-11-18");
        journal.displayDetails();
        journal.getSubmissionDetails(); 
    
    }
}

