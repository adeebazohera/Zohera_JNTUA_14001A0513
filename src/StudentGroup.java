import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		int[] result = new int[length];
		Student[] arr = new Student[];
		for(int i=0, j= result.length-1; i<arr.length; i++,j--)
		result[j]=arr[i];
		return result;
	}

	@Override
	public void setStudents(Student[] students) throws IllegalArgumentException{	
	}

	@Override
	public Student getStudent(int index) {
		try{
		System.out.println("Enter the student id");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num==Student.id)
		return Student[num];
		}
		catch(IllegalArgumentException e)
		{
		if (num<0 || num>Student.length)
			System.out.println("Enter valid data");
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		System.out.println("Enter the position that needs to be replaced");
		pos=sc.nextInt();
		System.out.println("Enter the element with which you ould replace");
		rep=sc.nextInt();
		Student[tmp]=Student[pos];
		Student[pos]=Student[rep];
		Student[rep]=Student[tmp];
	}

	@Override
	public void addFirst(Student student) {
		List<String> list = new ArrayList<String>();
		list.add(Student);
	}

	@Override
	public void addLast(Student student) {
		System.out.println("Enter the element:");
		new=sc.nextInt();
		Student[length+1]=Student[new];
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		System.out.println("Enter the element to remove");
		index=sc.nextInt();
		Student[index]='\0';
	}

	@Override
	public void remove(Student student) {
		Student.remove(student);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		System.out.println("Enter  the age");
		ag=sc.nextInt();
		System.out.println(+Student.age);
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		stu= max(student.MaxAvgMark());
		System.out.println(+stu);
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		System.out.println("Enter the position:");
		pos=sc.nextInt();
		System.out.println(+ pos+1);
		return null;
	}
}
