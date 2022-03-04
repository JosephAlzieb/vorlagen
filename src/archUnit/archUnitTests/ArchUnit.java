//package ;
//
//@AnalyzeClasses(packagesOf = ThymeleafSqlSeqApplication.class )
//public class ArchUnit {
//
//    @ArchTest
//    static final ArchRule ALL_CONTROLLERS_SHOULD_RESIDE_IN_CONTROLLERS_PACKAGE = classes()
//            .that()
//            .resideOutsideOfPackages("..controllers..")
//            .should()
//            .notBeAnnotatedWith(Controller.class);
//
//    @ArchTest
//    static final ArchRule No_FIELD_INJECTION = GeneralCodingRules.NO_CLASSES_SHOULD_USE_FIELD_INJECTION;
//}