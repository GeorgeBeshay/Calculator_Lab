package mainPack.TestCases;

import org.junit.Assert;
import org.junit.Test;

import mainPack.CalculatorBackServer.CalcFields;
import mainPack.CalculatorBackServer.Solver;

public class SolverTester {
	
	Solver solverUnderTesting = new Solver();
	
	@Test 
	public void testSolverForSignInversion0(){ 
	CalcFields sampleCalcFields = new CalcFields(510697796540.43567, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-510697796540.43567), 0);
	}
	@Test 
	public void testSolverForSignInversion1(){ 
	CalcFields sampleCalcFields = new CalcFields(-98520998981.90186, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (98520998981.90186), 0);
	}
	@Test 
	public void testSolverForSignInversion2(){ 
	CalcFields sampleCalcFields = new CalcFields(383087326869.19653, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-383087326869.19653), 0);
	}
	@Test 
	public void testSolverForSignInversion3(){ 
	CalcFields sampleCalcFields = new CalcFields(363797843277.0759, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-363797843277.0759), 0);
	}
	@Test 
	public void testSolverForSignInversion4(){ 
	CalcFields sampleCalcFields = new CalcFields(-126005945828.3361, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (126005945828.3361), 0);
	}
	@Test 
	public void testSolverForSignInversion5(){ 
	CalcFields sampleCalcFields = new CalcFields(-262708910735.8025, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (262708910735.8025), 0);
	}
	@Test 
	public void testSolverForSignInversion6(){ 
	CalcFields sampleCalcFields = new CalcFields(617487762499.6421, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-617487762499.6421), 0);
	}
	@Test 
	public void testSolverForSignInversion7(){ 
	CalcFields sampleCalcFields = new CalcFields(82703104649.78314, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-82703104649.78314), 0);
	}
	@Test 
	public void testSolverForSignInversion8(){ 
	CalcFields sampleCalcFields = new CalcFields(-569313965210.329, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (569313965210.329), 0);
	}
	@Test 
	public void testSolverForSignInversion9(){ 
	CalcFields sampleCalcFields = new CalcFields(615188082836.5385, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-615188082836.5385), 0);
	}
	@Test
	public void testSolverForSignInversion10() {
		CalcFields sampleCalcFields = new CalcFields(-23459.234443231313, "revSign", 0, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (23459.234443231313), 0);
	}
	
	@Test 
	public void testSolverForSquare0(){ 
	CalcFields sampleCalcFields = new CalcFields(408479569450.6952, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.6685555865862533e+23), 0);
	}
	@Test 
	public void testSolverForSquare1(){ 
	CalcFields sampleCalcFields = new CalcFields(-80000163728.50418, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (6.400026196587476e+21), 0);
	}
	@Test 
	public void testSolverForSquare2(){ 
	CalcFields sampleCalcFields = new CalcFields(-10021421956.662575, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.0042889803347875e+20), 0);
	}
	@Test 
	public void testSolverForSquare3(){ 
	CalcFields sampleCalcFields = new CalcFields(-203080957879.9442, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (4.124187545343567e+22), 0);
	}
	@Test 
	public void testSolverForSquare4(){ 
	CalcFields sampleCalcFields = new CalcFields(-319988929955.6597, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.0239291529416811e+23), 0);
	}
	@Test 
	public void testSolverForSquare5(){ 
	CalcFields sampleCalcFields = new CalcFields(-135664382202.29895, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.8404824598331448e+22), 0);
	}
	@Test 
	public void testSolverForSquare6(){ 
	CalcFields sampleCalcFields = new CalcFields(243196061718.93515, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (5.9144324435600115e+22), 0);
	}
	@Test 
	public void testSolverForSquare7(){ 
	CalcFields sampleCalcFields = new CalcFields(-80254603134.00627, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (6.440801324196849e+21), 0);
	}
	@Test 
	public void testSolverForSquare8(){ 
	CalcFields sampleCalcFields = new CalcFields(292357493969.09576, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (8.547290427988986e+22), 0);
	}
	@Test 
	public void testSolverForSquare9(){ 
	CalcFields sampleCalcFields = new CalcFields(-287986813647.63477, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (8.293640483491751e+22), 0);
	}
	@Test
	public void testSolverForSquare10() {
		CalcFields sampleCalcFields = new CalcFields(243623.2343445, "p2", 0, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (Math.pow(243623.2343445, 2)), 0);
	}
	
	@Test 
	public void testSolverForSquareRoot0(){ 
	CalcFields sampleCalcFields = new CalcFields(20936982625.94903, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (144696.17350140616), 0);
	}
	@Test 
	public void testSolverForSquareRoot1(){ 
	CalcFields sampleCalcFields = new CalcFields(464792978109.8535, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (681757.272135658), 0);
	}
	@Test 
	public void testSolverForSquareRoot2(){ 
	CalcFields sampleCalcFields = new CalcFields(262095526274.76453, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (511952.66018916684), 0);
	}
	@Test 
	public void testSolverForSquareRoot3(){ 
	CalcFields sampleCalcFields = new CalcFields(95101629550.05618, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (308385.5209799192), 0);
	}
	@Test 
	public void testSolverForSquareRoot4(){ 
	CalcFields sampleCalcFields = new CalcFields(179727421611.97006, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (423942.7102946459), 0);
	}
	@Test 
	public void testSolverForSquareRoot5(){ 
	CalcFields sampleCalcFields = new CalcFields(474449423581.38715, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (688802.8916761217), 0);
	}
	@Test 
	public void testSolverForSquareRoot6(){ 
	CalcFields sampleCalcFields = new CalcFields(106294341439.40675, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (326028.12982840417), 0);
	}
	@Test 
	public void testSolverForSquareRoot7(){ 
	CalcFields sampleCalcFields = new CalcFields(108422910896.84068, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (329276.34427155665), 0);
	}
	@Test 
	public void testSolverForSquareRoot8(){ 
	CalcFields sampleCalcFields = new CalcFields(301883964221.0957, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (549439.6820590006), 0);
	}
	@Test 
	public void testSolverForSquareRoot9(){ 
	CalcFields sampleCalcFields = new CalcFields(36631773342.966934, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (191394.28764455573), 0);
	}
	@Test
	public void testSolverForSquareRoot10() {
		CalcFields sampleCalcFields = new CalcFields(0, "rt", 0, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), 0, 0);
	}
	
	
	@Test 
	public void testSolverForMultiplicativeInverse0(){ 
	CalcFields sampleCalcFields = new CalcFields(-781819876818.144, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.2790669943949327e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse1(){ 
	CalcFields sampleCalcFields = new CalcFields(-331721399574.9306, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.0145778996513485e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse2(){ 
	CalcFields sampleCalcFields = new CalcFields(-263131992380.4256, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.800374066845663e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse3(){ 
	CalcFields sampleCalcFields = new CalcFields(-197916536357.21173, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-5.052634905630824e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse4(){ 
	CalcFields sampleCalcFields = new CalcFields(-113746800943.92511, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-8.791456038337112e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse5(){ 
	CalcFields sampleCalcFields = new CalcFields(193144798604.79785, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (5.1774627493135055e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse6(){ 
	CalcFields sampleCalcFields = new CalcFields(-423589973999.90826, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.360773534267401e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse7(){ 
	CalcFields sampleCalcFields = new CalcFields(-366734794647.08344, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.7267660843643726e-12), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse8(){ 
	CalcFields sampleCalcFields = new CalcFields(83198751311.25314, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.2019411159897346e-11), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse9(){ 
	CalcFields sampleCalcFields = new CalcFields(578431984958.7622, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.728811728955985e-12), 0);
	}
	@Test
	public void testSolverForMultiplicativeInverse10() {
		CalcFields sampleCalcFields = new CalcFields(23524.232323, "p-1", 0, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1/23524.232323), 0);
	}

	@Test 
	public void testSolverForPercentage0(){ 
	CalcFields sampleCalcFields = new CalcFields(-177437019257.37274, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1774370192.5737274), 0);
	}
	@Test 
	public void testSolverForPercentage1(){ 
	CalcFields sampleCalcFields = new CalcFields(-287831793282.0137, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2878317932.8201365), 0);
	}
	@Test 
	public void testSolverForPercentage2(){ 
	CalcFields sampleCalcFields = new CalcFields(22569841214.809467, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (225698412.14809468), 0);
	}
	@Test 
	public void testSolverForPercentage3(){ 
	CalcFields sampleCalcFields = new CalcFields(5844733416.765738, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (58447334.167657375), 0);
	}
	@Test 
	public void testSolverForPercentage4(){ 
	CalcFields sampleCalcFields = new CalcFields(463452697743.6131, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (4634526977.436131), 0);
	}
	@Test 
	public void testSolverForPercentage5(){ 
	CalcFields sampleCalcFields = new CalcFields(117703299270.42755, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1177032992.7042756), 0);
	}
	@Test 
	public void testSolverForPercentage6(){ 
	CalcFields sampleCalcFields = new CalcFields(238174385164.8414, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2381743851.648414), 0);
	}
	@Test 
	public void testSolverForPercentage7(){ 
	CalcFields sampleCalcFields = new CalcFields(880577735123.3156, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (8805777351.233156), 0);
	}
	@Test 
	public void testSolverForPercentage8(){ 
	CalcFields sampleCalcFields = new CalcFields(75958133965.357, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (759581339.6535699), 0);
	}
	@Test 
	public void testSolverForPercentage9(){ 
	CalcFields sampleCalcFields = new CalcFields(159832948220.51758, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1598329482.2051759), 0);
	}
	@Test
	public void testSolverForPercentage10() {
		CalcFields sampleCalcFields = new CalcFields(43.23235, "perc", 0, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (43.23235/100), 0);
	}
	
	
	@Test 
	public void testSolverForSubtraction0(){ 
	CalcFields sampleCalcFields = new CalcFields(194972908942.3552, "minus", 88933618873.99069, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (106039290068.3645), 0);
	}
	@Test 
	public void testSolverForSubtraction1(){ 
	CalcFields sampleCalcFields = new CalcFields(-112325888769.65059, "minus", 935534038079.3793, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1047859926849.0299), 0);
	}
	@Test 
	public void testSolverForSubtraction2(){ 
	CalcFields sampleCalcFields = new CalcFields(-234069245506.46616, "minus", -650084645758.0492, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (416015400251.583), 0);
	}
	@Test 
	public void testSolverForSubtraction3(){ 
	CalcFields sampleCalcFields = new CalcFields(-125687485381.99158, "minus", 140146329708.9886, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-265833815090.98016), 0);
	}
	@Test 
	public void testSolverForSubtraction4(){ 
	CalcFields sampleCalcFields = new CalcFields(215231517046.38693, "minus", -87821435345.80624, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (303052952392.1932), 0);
	}
	@Test 
	public void testSolverForSubtraction5(){ 
	CalcFields sampleCalcFields = new CalcFields(6749951235.888473, "minus", -8138603806.957407, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (14888555042.845879), 0);
	}
	@Test 
	public void testSolverForSubtraction6(){ 
	CalcFields sampleCalcFields = new CalcFields(-21072380327.934273, "minus", 39128455423.01578, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-60200835750.95005), 0);
	}
	@Test 
	public void testSolverForSubtraction7(){ 
	CalcFields sampleCalcFields = new CalcFields(-17127833420.648645, "minus", 118923509296.31444, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-136051342716.96309), 0);
	}
	@Test 
	public void testSolverForSubtraction8(){ 
	CalcFields sampleCalcFields = new CalcFields(27616308236.287617, "minus", -661499969.4112384, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (28277808205.698856), 0);
	}
	@Test 
	public void testSolverForSubtraction9(){ 
	CalcFields sampleCalcFields = new CalcFields(344507600438.39606, "minus", -9223271023.953815, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (353730871462.34985), 0);
	}
	@Test
	public void testSolverForSubtraction10() {
		CalcFields sampleCalcFields = new CalcFields(43259.3243, "minus", 23498.344434, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (43259.3243-23498.344434), 0);
	}
	
	@Test 
	public void testSolverForAddition0(){ 
	CalcFields sampleCalcFields = new CalcFields(-452916993663.13367, "add", -1754982648.0906453, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-454671976311.2243), 0);
	}
	@Test 
	public void testSolverForAddition1(){ 
	CalcFields sampleCalcFields = new CalcFields(-694378156720.3932, "add", 892346132010.5973, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (197967975290.2041), 0);
	}
	@Test 
	public void testSolverForAddition2(){ 
	CalcFields sampleCalcFields = new CalcFields(-3988171660.966704, "add", -100951603699.7867, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-104939775360.7534), 0);
	}
	@Test 
	public void testSolverForAddition3(){ 
	CalcFields sampleCalcFields = new CalcFields(-253373823039.17737, "add", -435032316584.78174, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-688406139623.9591), 0);
	}
	@Test 
	public void testSolverForAddition4(){ 
	CalcFields sampleCalcFields = new CalcFields(-719192922194.6709, "add", 11334575171.186068, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-707858347023.4849), 0);
	}
	@Test 
	public void testSolverForAddition5(){ 
	CalcFields sampleCalcFields = new CalcFields(70682105984.70876, "add", 634237960564.7085, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (704920066549.4172), 0);
	}
	@Test 
	public void testSolverForAddition6(){ 
	CalcFields sampleCalcFields = new CalcFields(216888964378.9864, "add", -22446354059.967003, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (194442610319.01938), 0);
	}
	@Test 
	public void testSolverForAddition7(){ 
	CalcFields sampleCalcFields = new CalcFields(850493316774.8832, "add", 721938366664.5121, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1572431683439.3953), 0);
	}
	@Test 
	public void testSolverForAddition8(){ 
	CalcFields sampleCalcFields = new CalcFields(-81770629134.09569, "add", -206064913057.9019, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-287835542191.99756), 0);
	}
	@Test 
	public void testSolverForAddition9(){ 
	CalcFields sampleCalcFields = new CalcFields(309497399612.47363, "add", 95677986593.73587, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (405175386206.2095), 0);
	}
	@Test
	public void testSolverForAddition10() {
		CalcFields sampleCalcFields = new CalcFields(3242, "add", 123215, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (3242.0+123215), 0);
	}
	
	@Test 
	public void testSolverForDivison0(){ 
	CalcFields sampleCalcFields = new CalcFields(-413728576326.4375, "div", 923033591357.0836, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.4482269986709324), 0);
	}
	@Test 
	public void testSolverForDivison1(){ 
	CalcFields sampleCalcFields = new CalcFields(-843288018597.7135, "div", -382497059920.9189, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.2046915047453255), 0);
	}
	@Test 
	public void testSolverForDivison2(){ 
	CalcFields sampleCalcFields = new CalcFields(-278887766961.02405, "div", -33783584978.742043, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (8.255126480404941), 0);
	}
	@Test 
	public void testSolverForDivison3(){ 
	CalcFields sampleCalcFields = new CalcFields(-47758072353.772835, "div", -537213933001.0964, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.08889954154200123), 0);
	}
	@Test 
	public void testSolverForDivison4(){ 
	CalcFields sampleCalcFields = new CalcFields(-111523919394.29614, "div", 552945908616.7544, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.20169046855466133), 0);
	}
	@Test 
	public void testSolverForDivison5(){ 
	CalcFields sampleCalcFields = new CalcFields(-623571396090.8868, "div", -256348142633.33292, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.432517706917077), 0);
	}
	@Test 
	public void testSolverForDivison6(){ 
	CalcFields sampleCalcFields = new CalcFields(149338716358.9427, "div", -243481891310.04825, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.6133462967427658), 0);
	}
	@Test 
	public void testSolverForDivison7(){ 
	CalcFields sampleCalcFields = new CalcFields(560045834.994255, "div", -246476314986.63806, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.0022722095428301743), 0);
	}
	@Test 
	public void testSolverForDivison8(){ 
	CalcFields sampleCalcFields = new CalcFields(-149869944353.965, "div", 694228048284.7487, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.21587999033495325), 0);
	}
	@Test 
	public void testSolverForDivison9(){ 
	CalcFields sampleCalcFields = new CalcFields(753264645343.5769, "div", -366094938351.8952, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.0575664026786655), 0);
	}
	@Test
	public void testSolverForDivison() {
		CalcFields sampleCalcFields = new CalcFields(7, "div", 3, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), 7.0/3, 0);
	}
	
	@Test 
	public void testSolverForMultiplication0(){ 
	CalcFields sampleCalcFields = new CalcFields(160665911461.4548, "times", -187371815889.27383, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.010426358203808e+22), 0);
	}
	@Test 
	public void testSolverForMultiplication1(){ 
	CalcFields sampleCalcFields = new CalcFields(-496632392170.894, "times", 580129150790.3275, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.8811092792506962e+23), 0);
	}
	@Test 
	public void testSolverForMultiplication2(){ 
	CalcFields sampleCalcFields = new CalcFields(334602578328.47034, "times", -950086029880.1727, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.179012352317659e+23), 0);
	}
	@Test 
	public void testSolverForMultiplication3(){ 
	CalcFields sampleCalcFields = new CalcFields(74092783053.26144, "times", 752147701453.9711, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (5.572871646783833e+22), 0);
	}
	@Test 
	public void testSolverForMultiplication4(){ 
	CalcFields sampleCalcFields = new CalcFields(-366512662037.3831, "times", 479340957908.38116, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.7568453050655e+23), 0);
	}
	@Test 
	public void testSolverForMultiplication5(){ 
	CalcFields sampleCalcFields = new CalcFields(692806342525.0204, "times", 211022573764.0641, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.4619777751969756e+23), 0);
	}
	@Test 
	public void testSolverForMultiplication6(){ 
	CalcFields sampleCalcFields = new CalcFields(64859596763.72348, "times", -383289072765.01086, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.485997470348007e+22), 0);
	}
	@Test 
	public void testSolverForMultiplication7(){ 
	CalcFields sampleCalcFields = new CalcFields(-221558530237.20728, "times", 447514124567.71484, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-9.91505716996134e+22), 0);
	}
	@Test 
	public void testSolverForMultiplication8(){ 
	CalcFields sampleCalcFields = new CalcFields(-260526818208.0026, "times", -746908226395.4316, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.9458962371618426e+23), 0);
	}
	@Test 
	public void testSolverForMultiplication9(){ 
	CalcFields sampleCalcFields = new CalcFields(100930119039.92722, "times", -103083098146.19635, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.0404189366900098e+22), 0);
	}
	@Test
	public void testSolverForMultiplication() {
		CalcFields sampleCalcFields = new CalcFields(6, "times", 3, 0);
		Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), 6.0*3, 0);
	}
	
	// -------------------
	@Test 
	public void testSolverForSignInversion11(){ 
	CalcFields sampleCalcFields = new CalcFields(803307581879.3308, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-803307581879.3308), 0);
	}
	@Test 
	public void testSolverForSquare11(){ 
	CalcFields sampleCalcFields = new CalcFields(739854134708.2211, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (5.473841406448505e+23), 0);
	}
	@Test 
	public void testSolverForSquareRoot11(){ 
	CalcFields sampleCalcFields = new CalcFields(51409504277.21373, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (226736.64079105904), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse11(){ 
	CalcFields sampleCalcFields = new CalcFields(103838569114.05556, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (9.630333011442087e-12), 0);
	}
	@Test 
	public void testSolverForPercentage11(){ 
	CalcFields sampleCalcFields = new CalcFields(30568335014.424614, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (305683350.14424616), 0);
	}
	@Test 
	public void testSolverForSubtraction11(){ 
	CalcFields sampleCalcFields = new CalcFields(689421451363.1288, "minus", 65255446706.08689, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (624166004657.0419), 0);
	}
	@Test 
	public void testSolverForAddition11(){ 
	CalcFields sampleCalcFields = new CalcFields(-847914564169.0848, "add", -380547054669.10504, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1228461618838.19), 0);
	}
	@Test 
	public void testSolverForDivison11(){ 
	CalcFields sampleCalcFields = new CalcFields(351506371180.93634, "div", 698494235737.2244, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.5032344623573588), 0);
	}
	@Test 
	public void testSolverForMultiplication11(){ 
	CalcFields sampleCalcFields = new CalcFields(-69076337107.20302, "times", 493270009843.64984, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.4073285484833306e+22), 0);
	}
	@Test 
	public void testSolverForSignInversion12(){ 
	CalcFields sampleCalcFields = new CalcFields(-422976656559.99854, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (422976656559.99854), 0);
	}
	@Test 
	public void testSolverForSquare12(){ 
	CalcFields sampleCalcFields = new CalcFields(-254245492316.36945, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (6.464077036319308e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot12(){ 
	CalcFields sampleCalcFields = new CalcFields(319132881722.0255, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (564918.4735181046), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse12(){ 
	CalcFields sampleCalcFields = new CalcFields(395105118403.291, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.530972020917435e-12), 0);
	}
	@Test 
	public void testSolverForPercentage12(){ 
	CalcFields sampleCalcFields = new CalcFields(-475690599736.58527, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-4756905997.365852), 0);
	}
	@Test 
	public void testSolverForSubtraction12(){ 
	CalcFields sampleCalcFields = new CalcFields(10528703978.929686, "minus", -484563756555.18146, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (495092460534.11115), 0);
	}
	@Test 
	public void testSolverForAddition12(){ 
	CalcFields sampleCalcFields = new CalcFields(145051134906.4959, "add", -721236614778.4089, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-576185479871.9131), 0);
	}
	@Test 
	public void testSolverForDivison12(){ 
	CalcFields sampleCalcFields = new CalcFields(-300075881652.0664, "div", -403324048555.39355, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.7440069163414966), 0);
	}
	@Test 
	public void testSolverForMultiplication12(){ 
	CalcFields sampleCalcFields = new CalcFields(-102904838115.19974, "times", -398357814557.5021, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (4.0992946418964505e+22), 0);
	}
	@Test 
	public void testSolverForSignInversion13(){ 
	CalcFields sampleCalcFields = new CalcFields(-844445372187.4215, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (844445372187.4215), 0);
	}
	@Test 
	public void testSolverForSquare13(){ 
	CalcFields sampleCalcFields = new CalcFields(720922383390.2928, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (5.197290828731404e+23), 0);
	}
	@Test 
	public void testSolverForSquareRoot13(){ 
	CalcFields sampleCalcFields = new CalcFields(8005302495.682409, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (89472.35604186586), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse13(){ 
	CalcFields sampleCalcFields = new CalcFields(16093148953.994898, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (6.21382429789643e-11), 0);
	}
	@Test 
	public void testSolverForPercentage13(){ 
	CalcFields sampleCalcFields = new CalcFields(269508522833.95444, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2695085228.3395443), 0);
	}
	@Test 
	public void testSolverForSubtraction13(){ 
	CalcFields sampleCalcFields = new CalcFields(-115963972581.02977, "minus", 558955554893.009, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-674919527474.0388), 0);
	}
	@Test 
	public void testSolverForAddition13(){ 
	CalcFields sampleCalcFields = new CalcFields(-22221037403.00806, "add", -586430872421.6064, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-608651909824.6145), 0);
	}
	@Test 
	public void testSolverForDivison13(){ 
	CalcFields sampleCalcFields = new CalcFields(-368603310422.39233, "div", -342265504381.07513, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.0769513892115548), 0);
	}
	@Test 
	public void testSolverForMultiplication13(){ 
	CalcFields sampleCalcFields = new CalcFields(139722539446.123, "times", 20171320549.885708, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.818388131211797e+21), 0);
	}
	@Test 
	public void testSolverForSignInversion14(){ 
	CalcFields sampleCalcFields = new CalcFields(115150672388.76826, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-115150672388.76826), 0);
	}
	@Test 
	public void testSolverForSquare14(){ 
	CalcFields sampleCalcFields = new CalcFields(110064512005.53047, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.211419680301556e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot14(){ 
	CalcFields sampleCalcFields = new CalcFields(37696039185.122604, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (194154.67850433738), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse14(){ 
	CalcFields sampleCalcFields = new CalcFields(-156623877197.72235, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-6.3847225460878975e-12), 0);
	}
	@Test 
	public void testSolverForPercentage14(){ 
	CalcFields sampleCalcFields = new CalcFields(-129249317755.77846, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1292493177.5577846), 0);
	}
	@Test 
	public void testSolverForSubtraction14(){ 
	CalcFields sampleCalcFields = new CalcFields(93485116715.90791, "minus", 272024275453.22867, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-178539158737.32074), 0);
	}
	@Test 
	public void testSolverForAddition14(){ 
	CalcFields sampleCalcFields = new CalcFields(-10618137194.455208, "add", -305241218922.9776, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-315859356117.4328), 0);
	}
	@Test 
	public void testSolverForDivison14(){ 
	CalcFields sampleCalcFields = new CalcFields(127329956990.77574, "div", 336262978241.1767, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.37866183680634424), 0);
	}
	@Test 
	public void testSolverForMultiplication14(){ 
	CalcFields sampleCalcFields = new CalcFields(22856848658.928814, "times", -353419748607.3289, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-8.078061706994385e+21), 0);
	}
	@Test 
	public void testSolverForSignInversion15(){ 
	CalcFields sampleCalcFields = new CalcFields(-738213278583.5519, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (738213278583.5519), 0);
	}
	@Test 
	public void testSolverForSquare15(){ 
	CalcFields sampleCalcFields = new CalcFields(-5110864383.350713, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.612093474500286e+19), 0);
	}
	@Test 
	public void testSolverForSquareRoot15(){ 
	CalcFields sampleCalcFields = new CalcFields(14560399316.016033, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (120666.47967027145), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse15(){ 
	CalcFields sampleCalcFields = new CalcFields(-55128099814.2279, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.8139569536585263e-11), 0);
	}
	@Test 
	public void testSolverForPercentage15(){ 
	CalcFields sampleCalcFields = new CalcFields(-605393861321.4722, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-6053938613.214722), 0);
	}
	@Test 
	public void testSolverForSubtraction15(){ 
	CalcFields sampleCalcFields = new CalcFields(-456010986601.4586, "minus", -164761993.1310961, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-455846224608.3275), 0);
	}
	@Test 
	public void testSolverForAddition15(){ 
	CalcFields sampleCalcFields = new CalcFields(72276696278.63646, "add", -24322507276.471333, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (47954189002.16513), 0);
	}
	@Test 
	public void testSolverForDivison15(){ 
	CalcFields sampleCalcFields = new CalcFields(115051000393.28078, "div", 355359994620.49097, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.323759010960562), 0);
	}
	@Test 
	public void testSolverForMultiplication15(){ 
	CalcFields sampleCalcFields = new CalcFields(-105901745113.21425, "times", 337965940807.21735, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-3.5791182920313584e+22), 0);
	}
	@Test 
	public void testSolverForSignInversion16(){ 
	CalcFields sampleCalcFields = new CalcFields(-176146594048.95078, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (176146594048.95078), 0);
	}
	@Test 
	public void testSolverForSquare16(){ 
	CalcFields sampleCalcFields = new CalcFields(-219261300568.564, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (4.807551792701816e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot16(){ 
	CalcFields sampleCalcFields = new CalcFields(165536992700.909, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (406862.37562707736), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse16(){ 
	CalcFields sampleCalcFields = new CalcFields(-463241477474.07214, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.1587013439572033e-12), 0);
	}
	@Test 
	public void testSolverForPercentage16(){ 
	CalcFields sampleCalcFields = new CalcFields(252173075812.81027, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2521730758.128103), 0);
	}
	@Test 
	public void testSolverForSubtraction16(){ 
	CalcFields sampleCalcFields = new CalcFields(-143675152499.51193, "minus", 739718516793.9521, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-883393669293.4641), 0);
	}
	@Test 
	public void testSolverForAddition16(){ 
	CalcFields sampleCalcFields = new CalcFields(-118422049133.5549, "add", 342922351295.26794, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (224500302161.71304), 0);
	}
	@Test 
	public void testSolverForDivison16(){ 
	CalcFields sampleCalcFields = new CalcFields(-53816072416.5891, "div", -18225766081.316685, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.9527467968414345), 0);
	}
	@Test 
	public void testSolverForMultiplication16(){ 
	CalcFields sampleCalcFields = new CalcFields(697830061105.045, "times", -150913388574.8642, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.0531189917076689e+23), 0);
	}
	@Test 
	public void testSolverForSignInversion17(){ 
	CalcFields sampleCalcFields = new CalcFields(-288542413177.3017, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (288542413177.3017), 0);
	}
	@Test 
	public void testSolverForSquare17(){ 
	CalcFields sampleCalcFields = new CalcFields(-156497997838.52805, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.449162332746793e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot17(){ 
	CalcFields sampleCalcFields = new CalcFields(422921334300.4242, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (650324.0225460107), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse17(){ 
	CalcFields sampleCalcFields = new CalcFields(289059317331.83484, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (3.4594975496050804e-12), 0);
	}
	@Test 
	public void testSolverForPercentage17(){ 
	CalcFields sampleCalcFields = new CalcFields(-98653043702.54427, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-986530437.0254426), 0);
	}
	@Test 
	public void testSolverForSubtraction17(){ 
	CalcFields sampleCalcFields = new CalcFields(368741051.13479376, "minus", 720440848959.2264, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-720072107908.0917), 0);
	}
	@Test 
	public void testSolverForAddition17(){ 
	CalcFields sampleCalcFields = new CalcFields(-238956423385.10605, "add", 758148048504.1116, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (519191625119.0055), 0);
	}
	@Test 
	public void testSolverForDivison17(){ 
	CalcFields sampleCalcFields = new CalcFields(-130824374501.45888, "div", -288554783178.81915, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.45337794459773767), 0);
	}
	@Test 
	public void testSolverForMultiplication17(){ 
	CalcFields sampleCalcFields = new CalcFields(82157414404.52733, "times", 239562249183.1337, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.968181498181935e+22), 0);
	}
	@Test 
	public void testSolverForSignInversion18(){ 
	CalcFields sampleCalcFields = new CalcFields(-128404537372.97882, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (128404537372.97882), 0);
	}
	@Test 
	public void testSolverForSquare18(){ 
	CalcFields sampleCalcFields = new CalcFields(-141294060889.64493, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.996401164268669e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot18(){ 
	CalcFields sampleCalcFields = new CalcFields(141609550202.76276, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (376310.4439193294), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse18(){ 
	CalcFields sampleCalcFields = new CalcFields(53416149081.96249, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.8720930227777857e-11), 0);
	}
	@Test 
	public void testSolverForPercentage18(){ 
	CalcFields sampleCalcFields = new CalcFields(-45382142553.86433, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-453821425.53864324), 0);
	}
	@Test 
	public void testSolverForSubtraction18(){ 
	CalcFields sampleCalcFields = new CalcFields(245052194337.49692, "minus", -101272436918.0171, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (346324631255.51404), 0);
	}
	@Test 
	public void testSolverForAddition18(){ 
	CalcFields sampleCalcFields = new CalcFields(12290411715.24532, "add", -343985402399.0064, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-331694990683.7611), 0);
	}
	@Test 
	public void testSolverForDivison18(){ 
	CalcFields sampleCalcFields = new CalcFields(329508850943.4384, "div", 700866311289.5977, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (0.47014508421319384), 0);
	}
	@Test 
	public void testSolverForMultiplication18(){ 
	CalcFields sampleCalcFields = new CalcFields(34924467103.46348, "times", -667058419659.6727, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.3296659833492578e+22), 0);
	}
	@Test 
	public void testSolverForSignInversion19(){ 
	CalcFields sampleCalcFields = new CalcFields(-450131203995.7785, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (450131203995.7785), 0);
	}
	@Test 
	public void testSolverForSquare19(){ 
	CalcFields sampleCalcFields = new CalcFields(-186384162905.37048, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (3.473905618193568e+22), 0);
	}
	@Test 
	public void testSolverForSquareRoot19(){ 
	CalcFields sampleCalcFields = new CalcFields(194213167221.68698, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (440696.2300969762), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse19(){ 
	CalcFields sampleCalcFields = new CalcFields(-568673348406.6083, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-1.7584787519969865e-12), 0);
	}
	@Test 
	public void testSolverForPercentage19(){ 
	CalcFields sampleCalcFields = new CalcFields(86724425410.52396, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (867244254.1052395), 0);
	}
	@Test 
	public void testSolverForSubtraction19(){ 
	CalcFields sampleCalcFields = new CalcFields(-58129448494.78552, "minus", 177009468013.58597, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-235138916508.3715), 0);
	}
	@Test 
	public void testSolverForAddition19(){ 
	CalcFields sampleCalcFields = new CalcFields(114355329808.87425, "add", 9859104001.31795, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (124214433810.1922), 0);
	}
	@Test 
	public void testSolverForDivison19(){ 
	CalcFields sampleCalcFields = new CalcFields(-6848666029.362224, "div", 642193367526.0826, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.010664491998329561), 0);
	}
	@Test 
	public void testSolverForMultiplication19(){ 
	CalcFields sampleCalcFields = new CalcFields(-343906896809.1322, "times", 670942354536.8801, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-2.30741703086591e+23), 0);
	}
	@Test 
	public void testSolverForSignInversion20(){ 
	CalcFields sampleCalcFields = new CalcFields(881914668174.9989, "revSign", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-881914668174.9989), 0);
	}
	@Test 
	public void testSolverForSquare20(){ 
	CalcFields sampleCalcFields = new CalcFields(496044868823.3677, "p2", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (2.4606051188599204e+23), 0);
	}
	@Test 
	public void testSolverForSquareRoot20(){ 
	CalcFields sampleCalcFields = new CalcFields(238954323607.8555, "rt", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (488829.54453250417), 0);
	}
	@Test 
	public void testSolverForMultiplicativeInverse20(){ 
	CalcFields sampleCalcFields = new CalcFields(30121122995.030903, "p-1", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (3.3199293404995904e-11), 0);
	}
	@Test 
	public void testSolverForPercentage20(){ 
	CalcFields sampleCalcFields = new CalcFields(-82642583640.61223, "perc", 0, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-826425836.4061223), 0);
	}
	@Test 
	public void testSolverForSubtraction20(){ 
	CalcFields sampleCalcFields = new CalcFields(-872814045008.2848, "minus", -396805508775.4023, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-476008536232.8825), 0);
	}
	@Test 
	public void testSolverForAddition20(){ 
	CalcFields sampleCalcFields = new CalcFields(-43214923784.82896, "add", 82005012791.1034, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (38790089006.27444), 0);
	}
	@Test 
	public void testSolverForDivison20(){ 
	CalcFields sampleCalcFields = new CalcFields(180563117271.6881, "div", -191167744832.78534, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (-0.9445271085330158), 0);
	}
	@Test 
	public void testSolverForMultiplication20(){ 
	CalcFields sampleCalcFields = new CalcFields(76562447339.2189, "times", 235691587620.85098, 0);
	Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), (1.80451247655183e+22), 0);
	}

}
