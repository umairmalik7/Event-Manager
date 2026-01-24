class Category {
    private int  categoryID;
    private String categoryName;

    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }
    public String toString(){
        return "Category_ID: "+ this.categoryID+"\nCategory_Name: "+this.categoryName;
    }

}