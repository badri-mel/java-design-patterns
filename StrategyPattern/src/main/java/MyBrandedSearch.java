public class MyBrandedSearch extends SearchEngine {
    public MyBrandedSearch() {
        searchBehaviour = new SearchPartnerOneConcrete();
    }
}
