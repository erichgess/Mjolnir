(ns mjolnir.core
  (:require [instaparse.core :as insta]))

; where x = 1

(def parser (insta/parser
             "WHERE = <'WHERE '> symbol <' = '> exp
              symbol = #'[a-zA-Z]+'
              exp = #'[0-9]+'"))

(defn use-parser [x]
  (parser x))
