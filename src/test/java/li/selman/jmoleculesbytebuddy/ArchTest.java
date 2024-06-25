package li.selman.jmoleculesbytebuddy;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesDddRules;

@AnalyzeClasses(packagesOf = JmoleculesBytebuddyBugApplication.class, importOptions = ImportOption.DoNotIncludeTests.class)
class ArchTest {

    @com.tngtech.archunit.junit.ArchTest
    ArchRule dddRules = JMoleculesDddRules.all();
}
