-- вывести всю таблицу
SELECT * FROM jaegers;

-- вывести только не уничтоженных роботов
SELECT * FROM jaegers WHERE status != 'Destroyed';

-- вывести роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-6');

-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- вывести самого старого робота
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- вывести роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE kaijukill IN ((SELECT MIN(kaijukill) FROM jaegers), (SELECT MAX(kaijukill) FROM jaegers));