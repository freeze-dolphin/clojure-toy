(ns app.main
  (:require [app.util :refer [pyslice]]))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn reload! []
  (println "Code updated.")
  (println "now:" (.now (js/Date.))))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn main! []
  (println "App loaded!")
  (let [tm (str (js/Date.))]
    (println (pyslice tm 41 -1 -1)))
  (js/setTimeout #(.write js/document
                          (str (reverse
                                (pyslice
                                 (str (js/Date.))
                                 34 -1 -1)))) 1000))
