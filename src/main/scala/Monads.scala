
/** Monad is a monoid in the category of endofunctors
 *
 *  A monoid in the category of endofunctors, with (the)
 *  product replaced by composition of endofunctors and
 *  unit set by the identity endofunctor.
 *
 *  A Mondegreen is mishearing or misinterpretation of a phrase in a way
 *  that gives it a new meaning. A malapropism
 *
 *  Curse of the Mondegreens reflection of how such misunderstanding can get you into trouble.
 * Lady Monadgreen Phrase Gilad Bracha coined in his talk Deconstructing Functional Programming(Qcon)
 * Lady Monadgreen's curse "Once you understand monads, you immediately become incapable of expalining
 * them to someone else
 *
 * Monad Is Something that has map and flatMap function
 * Operate on a parameterised type(container)
 * Be able to construct itself from that type
 * Provide the flatMap operation */

object Monads extends App {

trait Functor[F[_]] {
  def map[A, B](f: A => B): F[B]
}

trait Monad[F[_]]extends Functor[F] {
  def apply[A](a:A): F[A]
  def flatMap[A, B](f: A => F[B]): F[B]
}

class List[A] extends Monad[List] {
  override def apply[A](a: A): List[A] = ???

  override def flatMap[A, B](f: A => List[B]): List[B] = ???

  override def map[A, B](f: A => B): List[B] = ???
}
/** for each
 * for (i <- 0 to 5)
 * foreach without yield return Unit*/

  /** For Comprehension
   * for (i <- 0 to 5) yield i
   * */

  /** Map
   * ( */
}
