(ns grafter.vocabularies.core-test
  (:require [clojure.test :refer :all]
            [grafter.vocabularies.core :refer :all])
  (:import [java.net URI]))

(deftest prefixer-test
  (testing "Prefixer"
    (let [example-prefixer (prefixer "http://example.org/")]
      (is (= (example-prefixer "path")
             (URI. "http://example.org/path"))))))
