public interface SearchPartnerTwo extends SearchBehaviour {

    @Override
    default String search() {
        return "Searching Partner Two";
    }
}
