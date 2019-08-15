(ns grafter.vocabularies.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [grafter.vocabularies.core :refer [prefixer ->uri]]))

(deftest prefixer-test
  (testing "Prefixer"
    (let [example-prefixer (prefixer "http://example.org/")]
      (is (= (example-prefixer "path")
             (->uri "http://example.org/path"))))))
