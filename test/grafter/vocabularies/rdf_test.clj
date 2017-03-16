(ns grafter.vocabularies.rdf-test
  (:require [clojure.test :refer :all]
            [grafter.vocabularies.rdf :refer :all])
  (:import [java.net URI]))

(deftest rdf-type-test
  (testing "rdf:a"
    (is (= rdf:a
           (URI. "http://www.w3.org/1999/02/22-rdf-syntax-ns#type")))))
