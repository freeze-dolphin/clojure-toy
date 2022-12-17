(ns app.util)

(defn pyslice [string start end step]
  (loop [ss ""
         iter start]
    (if (>= (* step iter) (* step end))
      ss
      (recur (str ss (nth string iter))
             (+ iter step)))))
