public class MyApplication {
    public static void main(String[] args) {
        SearchEngine myBrandedSearch = new MyBrandedSearch();
        myBrandedSearch.setSearchBehaviour(new SearchPartnerOneConcrete());
        myBrandedSearch.performSearch();
        myBrandedSearch.setSearchBehaviour(new SearchPartnerTwoConcrete());
        myBrandedSearch.performSearch();
    }
}
