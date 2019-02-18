package dao;

public class BookedExcursionDao {
    String sql = "SELECT * FROM museum.bookedexcursion join excursion on  bookedexcursion.id = excursion.ExcursionID;";

}
