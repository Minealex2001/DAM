package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

class TestCalculadora(unittest.TestCase):
    def setUp(self):
        self.calc = Calculadora()
    
    def test_suma(self):
        self.assertEqual(self.calc.suma(1, 2), 3)
        self.assertEqual(self.calc.suma(-1, -2), -3)
        self.assertEqual(self.calc.suma(0, 0), 0)
    
    def test_resta(self):
        self.assertEqual(self.calc.resta(1, 2), -1)
        self.assertEqual(self.calc.resta(-1, -2), 1)
        self.assertEqual(self.calc.resta(0, 0), 0)
    
    def test_multiplica(self):
        self.assertEqual(self.calc.multiplica(1, 2), 2)
        self.assertEqual(self.calc.multiplica(-1, -2), 2)
        self.assertEqual(self.calc.multiplica(0, 0), 0)
        self.assertEqual(self.calc.multiplica(0, 1), 0)

if __name__ == '__main__':
    unittest.main()

    @Test
    public void testMain() {
        
    }