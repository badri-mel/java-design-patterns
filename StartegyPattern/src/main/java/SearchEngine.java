public abstract class SearchEngine {
    SearchBehaviour searchBehaviour;

    //delegate the behaviour to the interfaces
    public void performSearch() {
        System.out.println("****Searching using ***" + searchBehaviour.search());
    }

    public void setSearchBehaviour(SearchBehaviour searchBehaviour) {
        this.searchBehaviour = searchBehaviour;
    }
}
