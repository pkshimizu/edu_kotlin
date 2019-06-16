interface UserRepository

class UserService {
    @Inject
    lateinit var userRepository: UserRepository
}