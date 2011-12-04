(ns katapotter.test.core
  (:use [katapotter.core])
  (:use [clojure.test]))

(deftest calculate-test
  (is (= 51.6 (calculate [1 2 3 4 5 1 2 3])))
  (is (= 38 (calculate [1 2 2 3 4 5])))
  (is (= 141.6 (calculate [1 1 1 1 1 2 2 2 2 2 3 3 3 3 4 4 4 4 4 5 5 5 5])))
)
