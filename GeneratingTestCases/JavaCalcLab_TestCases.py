import math
import random


def testSolverForSignInversion(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForSignInversion{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1 + randNum2}, "revSign", 0, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({-1 * (randNum1 + randNum2)}), 0);\n"
          "}")


def testSolverForSquare(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForSquare{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "p2", 0, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({randNum1**2}), 0);\n"
          "}")


def testSolverForSquareRoot(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForSquareRoot{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({abs(randNum1)}, "rt", 0, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({math.sqrt(abs(randNum1))}), 0);\n"
          "}")


def testSolverForMultiplicativeInverse(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForMultiplicativeInverse{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "p-1", 0, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({1/(randNum1)}), 0);\n"
          "}")


def testSolverForPercentage(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForPercentage{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "perc", 0, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({(randNum1)/100}), 0);\n"
          "}")


def testSolverForSubtraction(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForSubtraction{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "minus", {randNum2}, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({randNum1-randNum2}), 0);\n"
          "}")


def testSolverForAddition(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForAddition{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "add", {randNum2}, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({randNum1+randNum2}), 0);\n"
          "}")


def testSolverForDivison(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForDivison{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "div", {randNum2}, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({randNum1/randNum2}), 0);\n"
          "}")


def testSolverForMultiplication(i):
    randNum1 = random.random() * random.randint(-1000000000000, 1000000000000)
    randNum2 = random.random() * random.randint(-1000000000000, 1000000000000)
    print(f"@Test \npublic void testSolverForMultiplication{i}()"
          "{ \n"
          f'CalcFields sampleCalcFields = new CalcFields({randNum1}, "times", {randNum2}, 0);\n'
          f"Assert.assertEquals(this.solverUnderTesting.solve(sampleCalcFields).getAns(), ({randNum1*randNum2}), 0);\n"
          "}")


def GenerateTestCases():
    for i in range(11, 21):
        testSolverForSignInversion(i)
        testSolverForSquare(i)
        testSolverForSquareRoot(i)
        testSolverForMultiplicativeInverse(i)
        testSolverForPercentage(i)
        testSolverForSubtraction(i)
        testSolverForAddition(i)
        testSolverForDivison(i)
        testSolverForMultiplication(i)


GenerateTestCases()
