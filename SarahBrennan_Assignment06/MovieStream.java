/**
 * Name: MovieStream
 *
 * Student name: Sarah Brennan
 * Student number: 2962279
 */

import java.util.*;
public interface MovieStream{
  public boolean add(Film f);
  public Film getFilm(String title);
  public List<Film> getDirector(String director);
  public double totalBudget();
  public boolean changeDirector(String title, String director);
  public boolean changeBudget(String title, double b);
  public void increaseBudgetBy(double percent);
}