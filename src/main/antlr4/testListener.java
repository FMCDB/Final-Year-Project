package main.antlr4;

// Generated from test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#blazon}.
	 * @param ctx the parse tree
	 */
	void enterBlazon(testParser.BlazonContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#blazon}.
	 * @param ctx the parse tree
	 */
	void exitBlazon(testParser.BlazonContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#tincture}.
	 * @param ctx the parse tree
	 */
	void enterTincture(testParser.TinctureContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#tincture}.
	 * @param ctx the parse tree
	 */
	void exitTincture(testParser.TinctureContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#tinctureNames}.
	 * @param ctx the parse tree
	 */
	void enterTinctureNames(testParser.TinctureNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#tinctureNames}.
	 * @param ctx the parse tree
	 */
	void exitTinctureNames(testParser.TinctureNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#complexField}.
	 * @param ctx the parse tree
	 */
	void enterComplexField(testParser.ComplexFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#complexField}.
	 * @param ctx the parse tree
	 */
	void exitComplexField(testParser.ComplexFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#fieldPosition}.
	 * @param ctx the parse tree
	 */
	void enterFieldPosition(testParser.FieldPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#fieldPosition}.
	 * @param ctx the parse tree
	 */
	void exitFieldPosition(testParser.FieldPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ordinaryPosition}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryPosition(testParser.OrdinaryPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ordinaryPosition}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryPosition(testParser.OrdinaryPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#escutcheonLocations}.
	 * @param ctx the parse tree
	 */
	void enterEscutcheonLocations(testParser.EscutcheonLocationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#escutcheonLocations}.
	 * @param ctx the parse tree
	 */
	void exitEscutcheonLocations(testParser.EscutcheonLocationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(testParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(testParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#coatDivision}.
	 * @param ctx the parse tree
	 */
	void enterCoatDivision(testParser.CoatDivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#coatDivision}.
	 * @param ctx the parse tree
	 */
	void exitCoatDivision(testParser.CoatDivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#seme}.
	 * @param ctx the parse tree
	 */
	void enterSeme(testParser.SemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#seme}.
	 * @param ctx the parse tree
	 */
	void exitSeme(testParser.SemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ordinary}.
	 * @param ctx the parse tree
	 */
	void enterOrdinary(testParser.OrdinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ordinary}.
	 * @param ctx the parse tree
	 */
	void exitOrdinary(testParser.OrdinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#diminutiveNames}.
	 * @param ctx the parse tree
	 */
	void enterDiminutiveNames(testParser.DiminutiveNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#diminutiveNames}.
	 * @param ctx the parse tree
	 */
	void exitDiminutiveNames(testParser.DiminutiveNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#charges}.
	 * @param ctx the parse tree
	 */
	void enterCharges(testParser.ChargesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#charges}.
	 * @param ctx the parse tree
	 */
	void exitCharges(testParser.ChargesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#subordinary}.
	 * @param ctx the parse tree
	 */
	void enterSubordinary(testParser.SubordinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#subordinary}.
	 * @param ctx the parse tree
	 */
	void exitSubordinary(testParser.SubordinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#ordinaryNames}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryNames(testParser.OrdinaryNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#ordinaryNames}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryNames(testParser.OrdinaryNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(testParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(testParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#animal}.
	 * @param ctx the parse tree
	 */
	void enterAnimal(testParser.AnimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#animal}.
	 * @param ctx the parse tree
	 */
	void exitAnimal(testParser.AnimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#animalNames}.
	 * @param ctx the parse tree
	 */
	void enterAnimalNames(testParser.AnimalNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#animalNames}.
	 * @param ctx the parse tree
	 */
	void exitAnimalNames(testParser.AnimalNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#animalPosition}.
	 * @param ctx the parse tree
	 */
	void enterAnimalPosition(testParser.AnimalPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#animalPosition}.
	 * @param ctx the parse tree
	 */
	void exitAnimalPosition(testParser.AnimalPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cadency}.
	 * @param ctx the parse tree
	 */
	void enterCadency(testParser.CadencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cadency}.
	 * @param ctx the parse tree
	 */
	void exitCadency(testParser.CadencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cadencyNames}.
	 * @param ctx the parse tree
	 */
	void enterCadencyNames(testParser.CadencyNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cadencyNames}.
	 * @param ctx the parse tree
	 */
	void exitCadencyNames(testParser.CadencyNamesContext ctx);
}