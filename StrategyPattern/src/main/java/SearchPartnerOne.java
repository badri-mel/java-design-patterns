public interface SearchPartnerOne extends SearchBehaviour {

    @Override
    default String search() {
        return "Searching Partner One";
    }
}
