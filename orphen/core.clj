(ns core)

(defn pyslice [string start end step]
  (loop [ss ""
         iter start]
    (if (>= (* step iter) (* step end))
      ss
      (recur (str ss (nth string iter))
             (+ iter step)))))


(println (pyslice "abcakljdlfks" 7 2 -1))
