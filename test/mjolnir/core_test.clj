(ns mjolnir.core-test
  (:require [clojure.test :refer :all]
            [mjolnir.core :refer :all]))

(deftest parses-grammar
  (testing "Actually parses stuff"
    (is (= (parser "WHERE X = 1")
           [:WHERE [:symbol "X"] [:exp "1"]]))
    (is (= (parser "WHERE multichar = 22")
           [:WHERE [:symbol "multichar"] [:exp "22"]]))))
