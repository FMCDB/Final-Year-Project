// Generated from test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#blazon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlazon(testParser.BlazonContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#tincture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTincture(testParser.TinctureContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#tinctureNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinctureNames(testParser.TinctureNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#complexField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexField(testParser.ComplexFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#fieldPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldPosition(testParser.FieldPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ordinaryPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryPosition(testParser.OrdinaryPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#escutcheonLocations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscutcheonLocations(testParser.EscutcheonLocationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(testParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#coatDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoatDivision(testParser.CoatDivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#seme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeme(testParser.SemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ordinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinary(testParser.OrdinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#diminutiveNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiminutiveNames(testParser.DiminutiveNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#charges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharges(testParser.ChargesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#subordinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubordinary(testParser.SubordinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#ordinaryNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryNames(testParser.OrdinaryNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(testParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#animal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimal(testParser.AnimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#animalNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimalNames(testParser.AnimalNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#animalPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnimalPosition(testParser.AnimalPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#cadency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadency(testParser.CadencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#cadencyNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadencyNames(testParser.CadencyNamesContext ctx);
}