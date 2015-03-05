(ns grafter.vocabularies.core)

(defn prefixer
  "Takes the base prefix of a URI string and returns a function that
  concatenates its argument onto the end of it e.g.
  ((prefixer \"http://example.org/\") \"foo\") ;; => \"http://example.org/foo\""
  [uri-prefix]
  (fn [value]
    (str uri-prefix value)))
