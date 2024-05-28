package test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTest;
import test.categori.WithMock;
import test.categori.WithoutMock;

import java.beans.Customizer;

@RunWith(Categories.class)
@Categories.IncludeCategory(WithMock.class)
@Categories.ExcludeCategory(WithoutMock.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCustom {
}
