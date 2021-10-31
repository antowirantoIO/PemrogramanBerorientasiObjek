package javaClassApplication.master.main;

class LibraryCard {
    private Student owner;
    private int borrowCnt;

    public LibraryCard( ) {
        owner = null;
        borrowCnt = 0;
    }

    public void checkOut(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }

    public int getNumberOfBooks( ) {
        return borrowCnt;
    }

    public String getOwnerName( ) {
        return owner.getName( ) ;
    }

    public void setOwner(Student student) {
        owner = student;
    }

    public String toString( ) {
        return "Owner Name:     " + owner.getName( ) + "\n" +
                "      Email:    " + owner.getEmail( ) + "\n" +
                "Books Borrowed: " + borrowCnt;
    }
}
